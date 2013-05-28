package qotd

class Quote {

	String content = "Default content"
	String author
	String nickname
	Date created = new Date()
    
	static constraints = {
    }
}
