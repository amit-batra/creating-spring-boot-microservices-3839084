package com.example.tourservice;

import com.example.tourservice.utilities.TourRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TravelAgentService {
    private  final TourRepository tourRepository;

    @Autowired
    public TravelAgentService(TourRepository tourRepository) {
        this.tourRepository = tourRepository;
    }

    public void displayTours() {
        tourRepository.findAll().forEach(System.out::println);
    }

    public void displayToursBy(Boolean isKidFriendly) {
        tourRepository.findByType(isKidFriendly).forEach(System.out::println);
    }
}