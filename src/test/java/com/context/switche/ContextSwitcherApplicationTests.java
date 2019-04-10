package com.context.switche;

import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.context.switche.domain.SwitchContext;
import com.context.switche.repository.SwitchContextRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ContextSwitcherApplicationTests {

	@Autowired
	SwitchContextRepository repo;
	
	@Before
	public void setUp() {
		repo.deleteAll();
		repo.save(new SwitchContext("Francisco", "Suporte", "Estudo Angular", "Suporte Signer", new Date()));
	}
	
	@Test
    public void gets() {
		List<SwitchContext> findAll = repo.findAll();
		for (SwitchContext switchContext : findAll) {
			System.out.println(switchContext.toString());
		}

    } 

}
