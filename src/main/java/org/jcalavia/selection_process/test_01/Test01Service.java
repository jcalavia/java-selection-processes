package org.jcalavia.selection_process.test_01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Test01Service {

    @Autowired
    private Test01Repository repository;

    public Test01Entity compress(String input) {
        Test01Entity result = repository.findByDecompressed(input);
        return result;
    }

    public Test01Entity decompress(String input) {
        Test01Entity result = repository.findByCompressed(input);
        return result;
    }
}
