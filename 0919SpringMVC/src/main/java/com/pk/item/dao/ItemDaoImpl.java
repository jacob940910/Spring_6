package com.pk.item.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pk.item.domain.Item;

@Repository
public class ItemDaoImpl implements ItemDao {
	//MyBatis 실행 객체를 주입
	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public List<Item> listItem() {
		return sqlSession.selectList("item.listitem");
	}

	@Override
	public Item getItem(int itemid) {
		return sqlSession.selectOne("item.getitem",itemid);
	}

}
