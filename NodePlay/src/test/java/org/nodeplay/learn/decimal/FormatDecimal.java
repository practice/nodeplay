package org.nodeplay.learn.decimal;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;

import org.junit.Test;

public class FormatDecimal {

	@Test
	public void test() {
		NumberFormat nf = NumberFormat.getNumberInstance();
		DecimalFormat df = (DecimalFormat)nf;
		df.applyPattern("#.####");	// "#,#00.0#"
		BigDecimal b1 = BigDecimal.valueOf(123456.00);
		b1.setScale(2);
		assertThat(df.format(b1), is("123456"));

		df.applyPattern("#,#00.0#");
		BigDecimal b2 = BigDecimal.valueOf(1234567.80);
		b2.setScale(2);
		assertThat(df.format(b2), is("1,234,567.8"));
	}
}
