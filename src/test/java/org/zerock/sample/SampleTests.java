package org.zerock.sample;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml") //설정파일 만든위치
@Log4j //로그를 찍을수 있는 객체를 생성해주는 언어
public class SampleTests {
	
	@Setter(onMethod_ = {@Autowired})
	private Restaurant restaurant;
	
	/*
	 @Autowired
	 public void setRestaurant(Restaurant restaurant) {
	 	this.restaurant = restaurant;
	 }
	 */
	@Test
	private void testExist() {
		assertNotNull(restaurant);
		
//		System.out.println(restaurant);
		log.info(restaurant);
		log.info(restaurant.getChef());
	}
	
}
