import com.chenjiafeng.ChaplainApplication;
import com.chenjiafeng.entity.Student;
import org.elasticsearch.action.admin.indices.create.CreateIndexRequest;
import org.elasticsearch.action.admin.indices.create.CreateIndexResponse;
import org.elasticsearch.client.RequestOptions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * @author chenjiafeng2
 * @create 2021-07-27 15:40
 * @desc
 **/
@RunWith(SpringRunner.class)
@SpringBootTest(classes = ChaplainApplication.class)
public class testdemo02 {
    @Autowired

    @Test
    public void contextLoads() {
        //1、构建 创建索引的请求
        CreateIndexRequest request = new CreateIndexRequest("xk_index");//索引名


    }

}
