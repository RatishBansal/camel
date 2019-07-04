/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.builder.endpoint.dsl;

import javax.annotation.Generated;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;

/**
 * The Validator component performs bean validation of the message body using
 * the Java Bean Validation API.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface BeanValidatorEndpointBuilderFactory {


    /**
     * Builder for endpoint for the Bean Validator component.
     */
    public interface BeanValidatorEndpointBuilder
            extends
                EndpointProducerBuilder {
        default AdvancedBeanValidatorEndpointBuilder advanced() {
            return (AdvancedBeanValidatorEndpointBuilder) this;
        }
        /**
         * Where label is an arbitrary text value describing the endpoint.
         * The option is a <code>java.lang.String</code> type.
         * @group producer
         */
        default BeanValidatorEndpointBuilder label(String label) {
            setProperty("label", label);
            return this;
        }
        /**
         * To use a custom ConstraintValidatorFactory.
         * The option is a
         * <code>javax.validation.ConstraintValidatorFactory</code> type.
         * @group producer
         */
        default BeanValidatorEndpointBuilder constraintValidatorFactory(
                Object constraintValidatorFactory) {
            setProperty("constraintValidatorFactory", constraintValidatorFactory);
            return this;
        }
        /**
         * To use a custom ConstraintValidatorFactory.
         * The option will be converted to a
         * <code>javax.validation.ConstraintValidatorFactory</code> type.
         * @group producer
         */
        default BeanValidatorEndpointBuilder constraintValidatorFactory(
                String constraintValidatorFactory) {
            setProperty("constraintValidatorFactory", constraintValidatorFactory);
            return this;
        }
        /**
         * To use a custom validation group.
         * The option is a <code>java.lang.String</code> type.
         * @group producer
         */
        default BeanValidatorEndpointBuilder group(String group) {
            setProperty("group", group);
            return this;
        }
        /**
         * To use a custom MessageInterpolator.
         * The option is a <code>javax.validation.MessageInterpolator</code>
         * type.
         * @group producer
         */
        default BeanValidatorEndpointBuilder messageInterpolator(
                Object messageInterpolator) {
            setProperty("messageInterpolator", messageInterpolator);
            return this;
        }
        /**
         * To use a custom MessageInterpolator.
         * The option will be converted to a
         * <code>javax.validation.MessageInterpolator</code> type.
         * @group producer
         */
        default BeanValidatorEndpointBuilder messageInterpolator(
                String messageInterpolator) {
            setProperty("messageInterpolator", messageInterpolator);
            return this;
        }
        /**
         * To use a custom TraversableResolver.
         * The option is a <code>javax.validation.TraversableResolver</code>
         * type.
         * @group producer
         */
        default BeanValidatorEndpointBuilder traversableResolver(
                Object traversableResolver) {
            setProperty("traversableResolver", traversableResolver);
            return this;
        }
        /**
         * To use a custom TraversableResolver.
         * The option will be converted to a
         * <code>javax.validation.TraversableResolver</code> type.
         * @group producer
         */
        default BeanValidatorEndpointBuilder traversableResolver(
                String traversableResolver) {
            setProperty("traversableResolver", traversableResolver);
            return this;
        }
        /**
         * To use a a custom ValidationProviderResolver.
         * The option is a
         * <code>javax.validation.ValidationProviderResolver</code> type.
         * @group producer
         */
        default BeanValidatorEndpointBuilder validationProviderResolver(
                Object validationProviderResolver) {
            setProperty("validationProviderResolver", validationProviderResolver);
            return this;
        }
        /**
         * To use a a custom ValidationProviderResolver.
         * The option will be converted to a
         * <code>javax.validation.ValidationProviderResolver</code> type.
         * @group producer
         */
        default BeanValidatorEndpointBuilder validationProviderResolver(
                String validationProviderResolver) {
            setProperty("validationProviderResolver", validationProviderResolver);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the Bean Validator component.
     */
    public interface AdvancedBeanValidatorEndpointBuilder
            extends
                EndpointProducerBuilder {
        default BeanValidatorEndpointBuilder basic() {
            return (BeanValidatorEndpointBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * The option is a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedBeanValidatorEndpointBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            setProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * The option will be converted to a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedBeanValidatorEndpointBuilder basicPropertyBinding(
                String basicPropertyBinding) {
            setProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * The option is a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedBeanValidatorEndpointBuilder synchronous(
                boolean synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * The option will be converted to a <code>boolean</code> type.
         * @group advanced
         */
        default AdvancedBeanValidatorEndpointBuilder synchronous(
                String synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
    }
    /**
     * The Validator component performs bean validation of the message body
     * using the Java Bean Validation API.
     * Maven coordinates: org.apache.camel:camel-bean-validator
     */
    default BeanValidatorEndpointBuilder beanValidator(String path) {
        class BeanValidatorEndpointBuilderImpl extends AbstractEndpointBuilder implements BeanValidatorEndpointBuilder, AdvancedBeanValidatorEndpointBuilder {
            public BeanValidatorEndpointBuilderImpl(String path) {
                super("bean-validator", path);
            }
        }
        return new BeanValidatorEndpointBuilderImpl(path);
    }
}