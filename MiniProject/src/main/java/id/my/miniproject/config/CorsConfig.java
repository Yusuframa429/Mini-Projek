package id.my.miniproject.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig {

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/api/**") // Mengizinkan semua path yang dimulai dengan /api/
                        .allowedOrigins("http://localhost:5173") // Alamat Vite kamu
                        .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS") // Method yang diizinkan
                        .allowedHeaders("*") // Mengizinkan semua header
                        .allowCredentials(true); // Mengizinkan cookie/auth jika nanti dibutuhkan
            }
        };
    }
}