/**************************************************************************************
 * Copyright (C) 2008 EsperTech, Inc. All rights reserved.                            *
 * http://esper.codehaus.org                                                          *
 * http://www.espertech.com                                                           *
 * ---------------------------------------------------------------------------------- *
 * The software in this package is published under the terms of the GPL license       *
 * a copy of which has been included with this distribution in the license.txt file.  *
 **************************************************************************************/
package com.espertech.esper.epl.agg.service;

import java.util.List;

public class AggregationServiceMatchRecognizeFactoryDesc
{
    private final AggregationServiceMatchRecognizeFactory aggregationServiceFactory;
    private final List<AggregationServiceAggExpressionDesc> expressions;

    public AggregationServiceMatchRecognizeFactoryDesc(AggregationServiceMatchRecognizeFactory aggregationServiceFactory, List<AggregationServiceAggExpressionDesc> expressions) {
        this.aggregationServiceFactory = aggregationServiceFactory;
        this.expressions = expressions;
    }

    public AggregationServiceMatchRecognizeFactory getAggregationServiceFactory() {
        return aggregationServiceFactory;
    }

    public List<AggregationServiceAggExpressionDesc> getExpressions() {
        return expressions;
    }
}
