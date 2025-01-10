package vass.com.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import vass.com.model.Notice;

import java.util.List;

@Repository
public interface NoticeRepository extends CrudRepository<Notice, Long> {
	
	@Query(value = "from Notice n where NOW() BETWEEN noticBegDt AND noticEndDt")
	List<Notice> findAllActiveNotices();

}
