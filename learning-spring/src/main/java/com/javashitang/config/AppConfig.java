package com.javashitang.config;

import com.javashitang.dao.EnableDao;
import com.javashitang.imports.MyImportSelector;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan("com.javashitang")
//@EnableDao
public class AppConfig {


}
