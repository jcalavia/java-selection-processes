package org.jcalavia.selection_process.test_01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/test01")
public class Test01Controller {
    @Autowired
    private Test01Service service;

    @GetMapping
    public String compress(String input) {
        return service.compress(input).getCompressed();
    }

    @GetMapping
    public String decompress(String input) {
        return service.decompress(input).getDecompressed();
    }
}