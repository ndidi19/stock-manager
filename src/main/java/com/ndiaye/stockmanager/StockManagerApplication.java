package com.ndiaye.stockmanager;

import com.ndiaye.stockmanager.entity.Article;
import com.ndiaye.stockmanager.entity.Category;
import com.ndiaye.stockmanager.repository.IArticleRepository;
import com.ndiaye.stockmanager.repository.ICategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;

@SpringBootApplication
public class StockManagerApplication implements CommandLineRunner {

	@Autowired
	private IArticleRepository articleRepository;

	@Autowired
	private ICategoryRepository categoryRepository;

	public static void main(String[] args) {
		SpringApplication.run(StockManagerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Category category = new Category("CAT_CHAUSSURES", "Chaussures");
		Category category2 = new Category("CAT_PANTALONS", "Pantalons");

		categoryRepository.save(category);
		categoryRepository.save(category2);

		Article article1 = new Article("JORDAN_5", "Jordan 5", "Ma paire de Jordan 5",
				new BigDecimal("99.00"), new BigDecimal("20.00")
		);
		Article article2 = new Article("SUPRA_SKYTOP", "SUPRA Skytop", "SUPRA Skytop 2",
				new BigDecimal("89.00"), new BigDecimal("19.6")
		);
		Article article3 = new Article("LEVIS_501", "Levis 501", "Levi's 501 nouveau modèle",
				new BigDecimal("79.00"), new BigDecimal("20.00")
		);
		article1.setCategory(category);
		article2.setCategory(category);
		article3.setCategory(category2);

		articleRepository.save(article1);
		articleRepository.save(article2);
		articleRepository.save(article3);
	}
}
