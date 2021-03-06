package ma.enset.productsapp;

import ma.enset.productsapp.entities.Product;
import ma.enset.productsapp.repositories.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ProductsAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProductsAppApplication.class, args);
    }
    @Bean
    CommandLineRunner start(ProductRepository productRepository){
        return args -> {
            productRepository.save(new Product(null,"Xiaomi",2000,34));
            productRepository.save(new Product(null,"Galaxy",1100,134));
            productRepository.save(new Product(null,"Iphone",500,34));
        };
    }

}
