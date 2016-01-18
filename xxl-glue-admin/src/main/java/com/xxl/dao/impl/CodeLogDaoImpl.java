package com.xxl.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.xxl.core.model.CodeLog;
import com.xxl.dao.ICodeLogDao;

@Repository
public class CodeLogDaoImpl implements ICodeLogDao {

	@Resource
	private SqlSessionTemplate sqlSessionTemplate;
	
	@Override
	public int save(CodeLog codeLog) {
		return sqlSessionTemplate.insert("CodeLogMapper.save", codeLog);
	}
	
	@Override
	public List<CodeLog> loadLogsByName(String name) {
		return sqlSessionTemplate.selectList("CodeLogMapper.loadLogsByName", name);
	}

}