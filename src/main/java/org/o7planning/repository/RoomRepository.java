package org.o7planning.repository;

import java.util.ArrayList;

import org.o7planning.entity.RoomEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

public interface RoomRepository extends JpaRepository<RoomEntity, Long>{
//	RoomEntity findOneByNumberRoom(String numberRoom);
//	List<RoomEntity> findByNumberRoom(String numberRoom);
	
	@Query(value="select * from room where room.number_room = ?", nativeQuery=true)
    ArrayList<RoomEntity> getRoomByNumberRoom(String number_room);
	
	@Modifying
	@Query(value="update room set numberpcurrent = numberpcurrent + 1 where id = :id", nativeQuery=true)	
	@Transactional(rollbackFor=Exception.class)
    void addNumberPeopleCurrent(@Param("id") Long id);
	
	@Modifying
	@Query(value="update room set numberpcurrent = numberpcurrent - 1 where id = :id", nativeQuery=true)	
	@Transactional(rollbackFor=Exception.class)
    void minusNumberPeopleCurrent(@Param("id") Long id);
	
	
}
