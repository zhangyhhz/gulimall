package com.zyh.gulimall.product;

import com.zyh.gulimall.product.entity.BrandEntity;
import com.zyh.gulimall.product.service.BrandService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
@RunWith(SpringRunner.class)
@Slf4j
public class GulimallProductApplicationTests {

	@Resource
	BrandService brandService;

	@Test
	public void contextLoads() {
		BrandEntity brandEntity = new BrandEntity();
		brandEntity.setDescript("");
		brandEntity.setName("华为");
		brandService.save(brandEntity);
		log.info("保存成功...");
	}

}
