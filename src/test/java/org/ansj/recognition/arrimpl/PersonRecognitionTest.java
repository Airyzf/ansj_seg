package org.ansj.recognition.arrimpl;

import org.ansj.domain.Term;
import org.ansj.splitWord.analysis.ToAnalysis;
import org.junit.Test;

public class PersonRecognitionTest {

	@Test
	public void test() {



		String[] tests = new String[]{
				"万圣节被识别为人名nr",
				"证明原告孙辉与被告姚宏旭之间的借款关系。",
				"欧阳娜娜借了长孙无忌三块钱",
				"谭彬林工号,杨军工号,陆江工号,姚曼青工号",
				"王总和小丽结婚了",
				"俞志龙和陈举亚是南京维数公司的同事",
				"邓颖超生前使用的物品",
				"费孝通向人大常委会提交书面报告",
				"徐德有说这是一个好日子",
				"政务司司长陈方安生出任委员会主席",
				"签约仪式前，秦光荣、李纪恒、仇和等一同会见了参加签约的企业家。",
				"王国强、高峰、汪洋、张朝阳、韩寒、小四",
				"张浩和胡健康复员了",
				"这里有关天培的壮烈",
				"龚学平等领导,邓颖超生前",
				"这源自萧红写给萧军信中的一句话",//fix #408
				"戴防蓝光眼镜",//fix #284
				"公信力，政府公信力",
				"可能和分词器关系不大，我说的单纯是指从名称而不是句子中识别人名，机构名，地名等，这些名称可长可短啦，当然一般都不会太长，比如像”周生生“，”余之味“, 这些看起来和人名差不多的机构名",
				"空城杨坤",//#154
				"李娜高擎“祥云”火炬” 的时候",//#113
				"上海浦东沿街办公出租：东方路北园路三百二十平，3元8每日每平，橱窗宽八米送车位二个露台二百平，房东18917023639【森盛】", //#50
				"苏宁易付宝",//#101
				"我通向了幸福之路，我总和你说要多写代码，心理有万马奔腾",
				"孙健和石源在韩小的右面，最左面是刘洁菲用电脑",
				"哈利法首相向江泽民主席和其他中国领导人转达了巴林王国国王哈马德·本·伊萨·阿勒哈利法陛下的问候。",
				"这群人中中国王健林是首富",
		} ;

		for (String str : tests){

			for (Term term : ToAnalysis.parse(str).getTerms()){
				if(term.isNewWord()) {
					System.out.print(term + "/" + term.isNewWord() + " ");
				}else{
					System.out.print(term + " ");
				}
			}
			System.out.println();
		}


	}
}
