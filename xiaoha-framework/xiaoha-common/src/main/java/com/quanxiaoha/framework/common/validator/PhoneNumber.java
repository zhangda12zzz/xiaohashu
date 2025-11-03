package com.quanxiaoha.framework.common.validator;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

/**
 * @author: 犬小哈
 * @date: 2024/4/15 22:22
 * @version: v1.0.0
 * @description: 自定义手机号校验注解
 **/
@Target({ ElementType.METHOD, ElementType.FIELD, ElementType.ANNOTATION_TYPE, ElementType.PARAMETER })
@Retention(RetentionPolicy.RUNTIME)
// 指定校验逻辑类
@Constraint(validatedBy = PhoneNumberValidator.class)
public @interface PhoneNumber {

    String message() default "手机号格式不正确, 需为 11 位数字";

    // 对验证注解进行分组，从而实现按需、分场景的验证
    Class<?>[] groups() default {};

    // 为验证注解附加元数据，通常用于携带错误的严重级别等信息
    Class<? extends Payload>[] payload() default {};
}
