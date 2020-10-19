package com.philips.daoTest;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.JdbcTest;
import org.springframework.context.annotation.Import;

import com.philips.dao.BedDaoImpl;
import com.philips.dao.IBedDao;
import com.philips.entity.Bed;

//@JdbcTest
public class BedDaoTest {
	@Autowired
	private IBedDao dao;
	
	@Test
	public void testBedDao() {
		Bed b=new Bed(20);
		//assertThat(dao.addBed(b)).isEqualTo(true);
		//List<Bed> lst = dao.viewBed();
		//assertThat(lst.contains(b)).isEqualTo(true);
	}
}
