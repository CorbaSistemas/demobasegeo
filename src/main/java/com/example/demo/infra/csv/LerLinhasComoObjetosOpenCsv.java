package com.example.demo.infra.csv;

import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

/**
 * @author <seu nome> on 24/05/2024
 */
public class LerLinhasComoObjetosOpenCsv {

	public static void main(String[] args) throws IOException {

		Reader reader = Files.newBufferedReader(Paths.get("pessoas.csv"));

		CsvToBean<CsvPessoa> csvToBean = new CsvToBeanBuilder(reader)
			.withType(CsvPessoa.class)
			.build();

		List<CsvPessoa> pessoas = csvToBean.parse();

		for (CsvPessoa pessoa : pessoas)
			System.out.println(pessoa);

	}
}
