package com.nit;

import java.util.Arrays;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nit.entity.EmployeeEntity;
import com.nit.repo.EmployeeRepo;

@SpringBootApplication
public class Test01Application {

	public static void main(String[] args) {

//		creating IOC
		ConfigurableApplicationContext cctx = SpringApplication.run(Test01Application.class, args);

//		Creating bean for EmployeeRepo
		EmployeeRepo repo = cctx.getBean(EmployeeRepo.class);

		System.out.println(repo + "   " + repo.getClass().getName());

		/*
		 * // 1..adding one Record using save() method // repo.save(new
		 * EmployeeEntity(101, "James", 2342.03f));
		 */

		/*
		 * // adding multiple records using saveAll() method repo.saveAll(
		 * Arrays.asList(new EmployeeEntity(102, "ramesh", 1342.03f), new
		 * EmployeeEntity(103, "Kamesh", 9342.03f), new EmployeeEntity(104, "palak",
		 * 888.03f), new EmployeeEntity(105, "Sita", 989.03f))); System.out.println();
		 */

//		fetching record by id(primary key)
		Optional<EmployeeEntity> record102 = repo.findById(102);
		System.out.println("102 record::" + record102);
		System.out.println();

//		fetching all records using findAllById();
		Iterable<EmployeeEntity> list = repo.findAllById(Arrays.asList(101, 102, 104));
		list.forEach(e -> System.out.println(e));
		System.out.println();

//		counting all records
		long count = repo.count();
		System.out.println(count);
		System.out.println();

//		fetching all records
		Iterable<EmployeeEntity> listAll = repo.findAll();
		listAll.forEach(e -> System.out.println(e));
		System.out.println();

//		checking whether id is exists or not
		System.out.println(repo.existsById(104));
		System.out.println();

//		deleting record by id
		// repo.deleteById(104);

//		counting all records
		long count1 = repo.count();
		System.out.println(count1);
		System.out.println();

//		fetching record  whose name "sita"
		EmployeeEntity sitaRecord = repo.findByEmpName("Sita");
		System.out.println(sitaRecord);
		System.out.println();

//		fetching record  whose name "sita"
		EmployeeEntity JamesRecord = repo.findByEmpNameAndEmpSal("james", 2342.03000f);
		System.out.println(JamesRecord);

//		closing IOC
		cctx.close();

	}

}
