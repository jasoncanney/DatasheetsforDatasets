# Datasheets for Datasets

## Overview
Datasheets for Datasets is a survey document intending to identify bias and data quality issues when businesses utilize data.  The document was created by a group of scholars led by Dr. Timnit Gebru.  The format of the document has historically been in a Word/PDF/Txt format which is not easily included in a company’s data on-boarding workflow tools and not easily shared with data sets when utilized by data scientists and analysts.

## Goals

The two goals of this project are to 

1. Remain true to the original intention of Dr Gebru in not making the Datasheets for Datasets survey document programmatic
2. Enable businesses to pull the questions into their existing data on-boarding workflow tools

## Problem

The problem with the current document format is that its not usable in company data on-boarding and workflow tools and difficult to attach to specific data sets for later use by data scientists and analysts.

The questions should still be reviewed by humans to understand if bias has potentially been introduced into the data.  Ultimately enabling businesses to more effectively utilize this data and make it visible from data on-boarding through to utilization by Data Science and Analytics.

## Documentation

- [Datasheets For Datasets ACM](https://dl.acm.org/doi/fullHtml/10.1145/3458723)
- [Datasheets For Datasets Cornell](https://arxiv.org/abs/1803.09010)

## Implementation

The implementation includes an XML derived version of the original Datasheets for Datasets word doc.  It also includes a basic xml parser written in Java to pull the questions and answers from the XML with binary answers and expected values for flagging within the Data Quality Engine

### XMLParser.java

Utilizes standard based DOM xml parser and a simple question.java class to read in the datasheets for datasets xml file

### XML Implementation

#### datasheets.xml

The datasheet for dataset has been converted to an xml format for programmatic interpretation.  The creator of the datasheet will utilize the QuestionAnswer and QuestionAnswer expected flags to identify if there is potential bias that has been introduced.

The following is the basic format of the datasheet spec in xml.  A UX could be used to input the answers to the questions in a more user friendly format.  Within the Data Quality Engine that will be the implementation.

The Datasheet for Dataset questions are broken into individual question fields in the xml file utilizing the following key


### XML Spec

###### - id
	- Datasheet for Dataset Question Identifier
###### - QuestionClassification
	- Classification of Question as specified in original Datasheet word doc
###### - QuestionTitle
	- Datasheet question
###### - QuestionAnswer
	- Binary yes/no answer
###### - QuestionAnswerExpected
	- Binary yes/no expected answer.  The creator should utilize this field to flag potential data quality and bias issues
###### - QuestionAnswerText
	- Datasheet answer to specific question

#### Example
	<Questions>
	        <Question>
	            <id>1</id>
	     <QuestionClassification>Motivation<QuestionClassification>
	            <QuestionTitle>For what purpose was the dataset created?</QuestionTitle>
	            <QuestionAnswer>1</QuestionAnswer>
	            <QuestionAnswerExpected>1</QuestionAnswerExpected>
	            <QuestionAnswerText>The data set is a collection of advertising impressions from Cable CO’s linear devices for a specific location and time period.  Cable Co utilizes this data to provide Ad campaign reporting and measurement</QuestionAnswerText>
	        </Question>
	
	
## Contributing

This project welcomes contributions from the community.  Current project scope is limited.  Please contact repo owner for updates
## Security

Please consult the security guide for our responsible security vulnerability disclosure process.

## License

Copyright (c) 2020, 2022 Oracle and/or its affiliates. Licensed under the Universal Permissive License v 1.0 as shown at https://oss.oracle.com/licenses/upl/