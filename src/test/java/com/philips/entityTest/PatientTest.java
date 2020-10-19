package com.philips.entityTest;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

import com.philips.entity.Patient;

public class PatientTest {
	@Test
	public void testPatientObject() {
		Patient p=new Patient(1,"tester","12345");
		assertThat(p.getpId()).isEqualTo(1);
		assertThat(p.getPhoneNo()).isEqualTo("12345");
		assertThat(p.getpName()).isEqualTo("tester");
	}
}
