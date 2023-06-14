package pro.sky.Homework21.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pro.sky.Homework21.model.Item;
import pro.sky.Homework21.service.StoreService;

import java.util.List;
import java.util.Set;

public class StoreController {
    private final StoreService storeService;
    public StoreController(StoreService storeService) {

    this.storeService = storeService;
    }
    @GetMapping("/add")
    public void add(@RequestParam("id") Set<Integer> ids) {
    storeService.add(ids);
    }
    @GetMapping("/get")
    public List<Item> get() {
    return storeService.get();
    }
}
