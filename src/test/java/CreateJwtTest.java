import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import java.util.Date;

/**
 * @author chenjiafeng2
 * @create 2021-08-12 14:58
 * @desc 测试jwt
 **/
public class CreateJwtTest {
    public static void main(String[] args) {

        JwtBuilder builder = Jwts.builder()
                .setId("888").setSubject("小白")
                .setIssuedAt(new Date())
                .signWith(SignatureAlgorithm.HS256, "cjfss");
        System.out.println(builder.compact());

    }
}
