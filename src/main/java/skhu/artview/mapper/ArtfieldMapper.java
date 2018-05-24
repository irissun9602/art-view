package skhu.artview.mapper;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import skhu.artview.dto.Artfield;;

@Mapper
public interface ArtfieldMapper {
	Artfield findOne(int id);
    List<Artfield> findAll();
    
}
