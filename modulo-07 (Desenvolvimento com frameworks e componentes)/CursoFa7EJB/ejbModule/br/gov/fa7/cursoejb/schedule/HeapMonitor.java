package br.gov.fa7.cursoejb.schedule;

import javax.ejb.LocalBean;
import javax.ejb.Schedule;
import javax.ejb.Stateless;

@Stateless
@LocalBean
public class HeapMonitor {

	@Schedule(hour = "*", minute = "*", second = "*/5", persistent = false)
	public void statisticas() {
		Runtime runtime = Runtime.getRuntime();
		Long max = toMegabyte(runtime.maxMemory());
		Long total = toMegabyte(runtime.totalMemory());
		Long livre = toMegabyte(runtime.freeMemory());
		Long usada = total - livre;
		System.out.printf("[Estatísticas de Memória]\n");
		System.out.printf("[Memória total: %s MB]\n", total.toString());
		System.out.printf("[Memória usada: %s MB]\n", usada.toString());
		System.out.printf("[Memória livre: %s MB]\n", livre.toString());
		System.out.printf("[Memória máxima: %s MB]\n", max.toString());
	}
	
	private Long toMegabyte(Long bytes){
		return bytes / 1024 / 1024;
	}

}
