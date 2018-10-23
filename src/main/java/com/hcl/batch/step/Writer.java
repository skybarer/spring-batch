package com.hcl.batch.step;

import java.util.List;

import org.springframework.batch.item.ItemWriter;

public class Writer implements ItemWriter<String> {

	@Override
	public void write(List<? extends String> messages) throws Exception {
		// System.out.println("ExampleRepository "+exampleRepository);
		for (String msg : messages) {
			System.out.println("writed to " + msg);
		}
	}

}
