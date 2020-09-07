package cn.wind.boot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.ParameterBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Parameter;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liuw
 */
 @Configuration
 @EnableSwagger2
public class Swagger2Config {

	@Bean
	public Docket createSystemApi() {
		//在配置好的配置类中增加此段代码即可
		ParameterBuilder parameter = new ParameterBuilder();
		List<Parameter> parameterList = new ArrayList<Parameter>();
		parameter.name("Authorization")
				.description("登录校验")	//name表示名称，description表示描述
				.modelRef(new ModelRef("string"))
				.parameterType("header")
				.required(false)
				.defaultValue("Bearer")
				.build();	//required表示是否必填，defaultvalue表示默认值
		parameterList.add(parameter.build());	//添加完此处一定要把下边的带***的也加上否则不生效
		
		return new Docket(DocumentationType.SWAGGER_2)
				.apiInfo(apiInfo())
				.groupName("系统管理")
				.select()
				.apis(RequestHandlerSelectors.basePackage("cn.wind.boot.controller.system"))
				.paths(PathSelectors.any())
				.build()
				.globalOperationParameters(parameterList);
	}

	@Bean
	public Docket createQingHaiApi() {
		//在配置好的配置类中增加此段代码即可
		ParameterBuilder parameter = new ParameterBuilder();
		List<Parameter> parameterList = new ArrayList<Parameter>();
		parameter.name("Authorization")
				.description("登录校验")	//name表示名称，description表示描述
				.modelRef(new ModelRef("string"))
				.parameterType("header")
				.required(false)
				.defaultValue("Bearer")
				.build();	//required表示是否必填，defaultvalue表示默认值
		parameterList.add(parameter.build());	//添加完此处一定要把下边的带***的也加上否则不生效

		return new Docket(DocumentationType.SWAGGER_2)
				.apiInfo(apiInfo())
				.groupName("青海api")
				.select()
				.apis(RequestHandlerSelectors.basePackage("cn.wind.boot.controller.qinghai"))
				.paths(PathSelectors.any())
				.build()
				.globalOperationParameters(parameterList);
	}

	private ApiInfo apiInfo() {
		return new ApiInfoBuilder()
				.title("Swagger2构建RESTful APIs")
				.description("请持续关注我们")
				.termsOfServiceUrl("http://www.baidu.com/")
				.version("1.0")
				.build();
	}

}

