package br.gov.fa7.cursoejb.interceptor;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.interceptor.AroundInvoke;
import javax.interceptor.InvocationContext;

public class LogInterceptor {

	private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss:SS");
	private static final String IN = "[%s][ENTRADA] %s(%s) \n";
	private static final String OUT = "[%s][DURATION = %s][SAIDA] %s \n";

	@AroundInvoke
	public Object logar(InvocationContext ctx) throws Exception {
		Long begin = System.currentTimeMillis();
		String mensagem = String.format(IN, LocalDateTime.now().format(formatter), ctx.getMethod().getName(), Arrays.asList(ctx.getParameters()));
		Logger.getLogger(ctx.getTarget().getClass().getName()).log(Level.INFO, mensagem);
		
		Object proceed = ctx.proceed();
		
		Long duration = System.currentTimeMillis() - begin;
		mensagem = String.format(OUT, LocalDateTime.now().format(formatter), duration.toString(), ctx.getMethod().getName());
		
		Logger.getLogger(ctx.getTarget().getClass().getName()).log(Level.INFO, mensagem);
		
		return proceed;
	}
}
