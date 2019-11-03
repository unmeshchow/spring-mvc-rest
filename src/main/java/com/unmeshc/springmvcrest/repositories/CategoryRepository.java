package com.unmeshc.springmvcrest.repositories;

import com.unmeshc.springmvcrest.domain.Category;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by uc on 11/3/2019
 */
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
