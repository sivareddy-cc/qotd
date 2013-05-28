package qotd

import javax.swing.text.AbstractDocument.Content;

import org.apache.tools.ant.taskdefs.Nice;

class QuoteController {

	def index() {
		redirect(action: home)
	}

	def home = {
		render "<h1>Real programmers do not eat Quiche</h1>"
	}

	def random = {
		def q = new Quote()
		q.author = "Siva Reddy"
		q.content = "Real Programmers dont eat much Quiche"
		q.nickname = "SR"
		def q1 = Quote.findOrSaveWhere(content: q.content, author: q.author, nickname: q.nickname)
		[ quote: q1.id]
	}
	
	def newQuote = {
		def q = Quote.findOrSaveWhere(content: params.content, author: params.author, nickname: params.nickname)
		render view: "random", model: [quote: q.id]
	}
}
