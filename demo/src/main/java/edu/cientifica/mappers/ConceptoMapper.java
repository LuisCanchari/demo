package edu.cientifica.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import com.mysql.cj.x.protobuf.MysqlxCrud.Column;

import edu.cientifica.model.Concepto;

@Mapper
public interface ConceptoMapper {
	
	@Select ("SELECT * FROM db_convivir.concepto")
	//@ResultMap("edu.cientifica.mappers.ConceptoMapper.conceptoResultMap")
	public List<Concepto>selectConcepto();

}
