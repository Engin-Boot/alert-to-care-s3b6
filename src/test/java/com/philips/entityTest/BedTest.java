package com.philips.entityTest;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import com.philips.entity.Bed;

public class BedTest {
	@Test
	public void testBedobject() {
		Bed b=new Bed(1);
		assertThat(b.getbId()).isEqualTo(1);
		assertThat(b.getPatientId()).isEqualTo(0);
		assertThat(b.isBedEmpty()).isEqualTo(true);
		assertThat(b.isAlertStatus()).isEqualTo(false);
	}
}
