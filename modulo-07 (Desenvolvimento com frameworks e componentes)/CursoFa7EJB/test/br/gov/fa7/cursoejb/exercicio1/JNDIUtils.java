package br.gov.fa7.cursoejb.exercicio1;

import java.util.Hashtable;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class JNDIUtils {

	public static <T> T lookup(String name) throws NamingException {
		Hashtable env = new Hashtable();
		env.put(Context.INITIAL_CONTEXT_FACTORY, "org.jboss.naming.remote.client.InitialContextFactory");
		env.put(Context.PROVIDER_URL, "remote://127.0.0.1:4447");
		env.put(Context.URL_PKG_PREFIXES, "org.jboss.ejb.client.naming");
		env.put("jboss.naming.client.ejb.context", true);
		Context context = new InitialContext(env);
		return (T) context.lookup(name);
	}

}
