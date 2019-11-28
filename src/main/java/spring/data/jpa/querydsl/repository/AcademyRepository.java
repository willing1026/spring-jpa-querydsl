package spring.data.jpa.querydsl.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.data.jpa.querydsl.domain.Academy;

public interface AcademyRepository extends JpaRepository<Academy, Long> {
}
