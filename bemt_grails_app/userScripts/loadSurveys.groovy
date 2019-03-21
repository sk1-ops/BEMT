import com.provia.bemt.domain.*
import Surveys

println 'loadSurvey.groovy: Loading Survey Enumeration Data....'

def s = new Surveys()
s.load()

println 'loadSurvey.groovy: Complete....'