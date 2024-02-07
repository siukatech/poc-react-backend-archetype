package ${package}.config;

import com.siukatech.poc.react.backend.parent.EnableReactBackend;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;

/**
 * Dont setup the webMvcConfigurer in child microservices
 *
 * Dont setup the corsFilter in child microservices
 * cors has been setup in parent library WebSecurityConfig
 */
@Slf4j
@Configuration
@EnableReactBackend
public class AppConfig {


}
