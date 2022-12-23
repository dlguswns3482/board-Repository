package study.board2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import study.board2.entity.Board;

@Repository
public interface BoardRepository extends JpaRepository<Board, Integer> {

}
