package com.example.project.Repositories;

import com.example.project.Model.Review;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

/**
 * Created by poo2 on 06/07/2015.
 */
public interface ReviewRepository extends PagingAndSortingRepository<Review, Long> {
    public List<Review> findByProjectIdAndSpecialityId();
}
