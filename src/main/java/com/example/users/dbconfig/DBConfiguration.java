package com.example.users.dbconfig;

import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@PropertySources({
@PropertySource("classpath:db.properties"),
@PropertySource("classpath:root.properties")})
public class DBConfiguration {
}
