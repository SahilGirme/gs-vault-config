package org.springframework.gs_vault_config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.gs_vault_config.config.MyConfiguration;


@SpringBootApplication
@EnableConfigurationProperties(MyConfiguration.class)
public class GsVaultConfigApplication implements CommandLineRunner {

	private final MyConfiguration configuration;

	public GsVaultConfigApplication(MyConfiguration configuration) {
		this.configuration = configuration;
	}

	public static void main(String[] args) {
		SpringApplication.run(GsVaultConfigApplication.class, args);
	}

	@Override
	public void run(String... args) {

		Logger logger = LoggerFactory.getLogger(GsVaultConfigApplication.class);

		logger.info("----------------------------------------");
		logger.info("Configuration properties");
		logger.info("   example.username is {}"+ configuration.getUsername());
		logger.info("   example.password is {}"+ configuration.getPassword());
		logger.info("----------------------------------------");
	}

}
