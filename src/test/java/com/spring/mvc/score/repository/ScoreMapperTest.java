package com.spring.mvc.score.repository;

import com.spring.mvc.score.domain.Grade;
import com.spring.mvc.score.domain.Score;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import java.beans.Transient;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

// 스프링컨테이너의 의존성 주입을 사용 가능
@SpringBootTest
class ScoreMapperTest {

    @Autowired
    ScoreMapper mapper;

    @Test
    @DisplayName("성적정보 1개를 정확하게 데이터베이스에 저장해야 한다.")
    void saveTest(){

        //given : 테스트시 주어질 데이터

        Score s = new Score();

        s.setName("한석봉");
        s.setKor(77);
        s.setEng(88);
        s.setMath(92);
        s.calcTotalAndAvg();
        s.calcGrade();

        //when : 테스트 상황

        boolean result = mapper.save(s);



        //then : 테스트 결과

        assertTrue(result); // 나는 result가 true라고 단언한다


    }


    @Test
    @DisplayName("성적정보를 전체 조회해야 한다.")
    void findAllTest(){
        //given

        //when

        List<Score> scoreList =  mapper.findAll("");

        //then

        assertEquals(2, scoreList.size());
        assertEquals("하야시",scoreList.get(0).getName());
        assertEquals(55,scoreList.get(2).getKor());

        for(Score score : scoreList){
            System.out.println(score);
        }

    }


    @Test
    @DisplayName("성적정보를 하나 조회해야 한다.")
    void findOneTest(){

        // GIVEN
        int stuNum = 2;
        Score score = new Score();

        // WHEN
        score =  mapper.findOne(stuNum);

        //THEN
        assertEquals("하야시",score.getName());
        assertEquals(Grade.F, score.getGrade());
        assertNotNull(score.getName());

        System.out.println(score);
    }

    @Test
    @DisplayName("성적정보를 하나 삭제해야 한다.")
    @Transactional
    @Rollback
    void removeTest(){

        int stuNum=8;


        boolean result = mapper.remove(stuNum);

        Score score = mapper.findOne(stuNum);

        assertNull(score);
        assertTrue(result);

    }




}