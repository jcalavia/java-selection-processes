package org.jcalavia.selection_process;

import org.jcalavia.selection_process.test_01.Test01Entity;
import org.jcalavia.selection_process.test_01.Test01Repository;
import org.jcalavia.selection_process.test_01.Test01Service;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.mockito.Mockito;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class Test01EntityServiceTest {
    @MockBean
    private Test01Repository repository;

    @Autowired
    private Test01Service service;

    @Test
    public void testFindCompressed() {
       // Test01Entity entity = new Test01Entity("a2b3c3a2", "aabbbcccaa");

       // Mockito.when(repository.findByCompressed("a2b3c3a2").thenReturn(entity));

        //Test01Entity result = service.findByCompressed("a2b3c3a2");
        //assertEquals("aabbbcccaa", result.getDecompressed());
    }
}