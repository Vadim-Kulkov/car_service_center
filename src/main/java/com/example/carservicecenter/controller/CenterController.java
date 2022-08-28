package com.example.carservicecenter.controller;

import com.example.carservicecenter.entities.CarServiceCenter;
import com.example.carservicecenter.entities.City;
import com.example.carservicecenter.repository.CarServiceCenterRepository;
import com.example.carservicecenter.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CenterController {

    @Autowired
    CarServiceCenterRepository carServiceCenterRepository;
    @Autowired
    CityRepository cityRepository;


    @RequestMapping("/")
    public String showAllCenters(Model model) {
        model.addAttribute("allCenters", carServiceCenterRepository.findAll());
        return "all-centers";
    }

    @RequestMapping("/addNewCenter")
    public String addNewEmployee(Model model) {
        City city = new City();
        CarServiceCenter center = new CarServiceCenter();
        center.setCity(city);

        model.addAttribute("city", new City());
        model.addAttribute("center", center);

        return "center-info";
    }

    @RequestMapping("/saveCenter")
    public String saveEmployee(@ModelAttribute("center") CarServiceCenter center) {
        cityRepository.save(center.getCity());
        carServiceCenterRepository.save(center);
        return "redirect:/";
    }

    @RequestMapping("/updateInfo")
    public String updateEmployee(@RequestParam("centerName") String name, Model model) {
        model.addAttribute("center", carServiceCenterRepository.findById(name));
        return "center-info";
    }

    @RequestMapping("/deleteCenter")
    public String deleteEmployee(@RequestParam("centerName") String name) {
        carServiceCenterRepository.deleteById(name);
        return "redirect:/";
    }
}
