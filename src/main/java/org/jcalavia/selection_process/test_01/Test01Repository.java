package org.jcalavia.selection_process.test_01;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Test01Repository extends JpaRepository<Test01Entity, Long> {
    Test01Entity findByCompressed(String compressed);

    Test01Entity findByDecompressed(String decompressed);
}