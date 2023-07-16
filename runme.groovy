               println("Executing anonymous inner Groovy class and some list sorting.. with $name")
               def list = ["banassssna", "apple", "grape", "durian", "cherry"]
               def sortedList = list.sort()
               println "Ascending order: $sortedList"
               def descendingSortedList = list.sort { a, b -> b.compareTo(a) }
               println "Ascending order: $descendingSortedList"
               return "whobedee edee $name"