package com.example.tourservice;

import com.example.tourservice.utilities.TourRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TourManagementService {
    private final TourRepository tourRepository;

    @Autowired
    public TourManagementService(TourRepository tourRepository) {
        this.tourRepository = tourRepository;
        createTour("Big Sur Retreat", 750, true);
        createTour( "Day Spa Package", 200, false);
        createTour("Monterey to SantaBarbara Tour", 550, false);
        createTour("Kids L.A. Tour", 100, true);
        createTour("Islands of the Blue Dolphins Tour", 200, true);
        createTour("Endangered Specie Expedition", 250, true);
    } 

    public Tour createTour(String title, Integer price, Boolean isKidFriendly) {
        return tourRepository.save(new Tour(title, price, isKidFriendly));
    }
}