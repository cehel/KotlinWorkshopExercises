package com.zuehlke.NewsAnalyzerKotlin.service.news

import com.zuehlke.NewsAnalyzerKotlin.service.news.NewsService


/* Created by celineheldner on 2019-10-06 */

class NewsServiceLocal: NewsService {

    override fun fetchNews(): String {
       return "{\n" +
               "  \"status\": \"ok\",\n" +
               "  \"totalResults\": 10,\n" +
               "  \"articles\": [\n" +
               "    {\n" +
               "      \"source\": {\n" +
               "        \"id\": \"bbc-news\",\n" +
               "        \"name\": \"BBC News\"\n" +
               "      },\n" +
               "      \"author\": \"BBC News\",\n" +
               "      \"title\": \"Northern California braced for mega power cut\",\n" +
               "      \"description\": \"In a bid to stop wildfires, San Francisco Bay Area residents could be denied power for several days.\",\n" +
               "      \"url\": \"http://www.bbc.co.uk/news/world-us-canada-49982236\",\n" +
               "      \"urlToImage\": \"https://ichef.bbci.co.uk/news/1024/branded_news/1323B/production/_109159387_whatsubject.jpg\",\n" +
               "      \"publishedAt\": \"2019-10-09T03:22:57Z\",\n" +
               "      \"content\": \"Image copyrightGetty ImagesImage caption\\r\\n A huge wildfire killed 86 people in Paradise, California, last year\\r\\nPower is set to be cut off for around 800,000 homes, business and other locations in Northern California, in an attempt to prevent wildfires.\\r\\nLarg… [+3737 chars]\"\n" +
               "    },\n" +
               "    {\n" +
               "      \"source\": {\n" +
               "        \"id\": \"bbc-news\",\n" +
               "        \"name\": \"BBC News\"\n" +
               "      },\n" +
               "      \"author\": \"BBC News\",\n" +
               "      \"title\": \"Deal by Brexit deadline very difficult - Irish PM\",\n" +
               "      \"description\": \"Leo Varadkar says \\\"big gaps\\\" remain between the EU and the UK as the 31 October deadline looms.\",\n" +
               "      \"url\": \"http://www.bbc.co.uk/news/uk-politics-49981265\",\n" +
               "      \"urlToImage\": \"https://ichef.bbci.co.uk/news/1024/branded_news/162A1/production/_109158709_mediaitem109157897.jpg\",\n" +
               "      \"publishedAt\": \"2019-10-09T02:04:52Z\",\n" +
               "      \"content\": \"Image copyrightGetty ImagesImage caption\\r\\n The two leaders are due to meet again in the coming days\\r\\nIt will be \\\"very difficult\\\" for the UK and the EU to reach a Brexit agreement before the 31 October deadline, Irish leader Leo Varadkar has said.\\r\\nHe told Iri… [+5813 chars]\"\n" +
               "    },\n" +
               "    {\n" +
               "      \"source\": {\n" +
               "        \"id\": \"bbc-news\",\n" +
               "        \"name\": \"BBC News\"\n" +
               "      },\n" +
               "      \"author\": \"BBC News\",\n" +
               "      \"title\": \"Hundreds of temperature records broken over summer\",\n" +
               "      \"description\": \"Nearly 400 all-time high temperature records were broken over the summer.\",\n" +
               "      \"url\": \"http://www.bbc.co.uk/news/science-environment-49753680\",\n" +
               "      \"urlToImage\": \"https://ichef.bbci.co.uk/news/1024/branded_news/03C2/production/_108026900_hi055484157.jpg\",\n" +
               "      \"publishedAt\": \"2019-10-09T01:27:58Z\",\n" +
               "      \"content\": \"Image copyrightGetty ImagesImage caption\\r\\n The skeleton of a fish lies on a dry part of the bed of the River Loire in western France\\r\\nAlmost 400 all-time high temperatures were set in the northern hemisphere over the summer, according to an analysis of temper… [+4562 chars]\"\n" +
               "    },\n" +
               "    {\n" +
               "      \"source\": {\n" +
               "        \"id\": \"bbc-news\",\n" +
               "        \"name\": \"BBC News\"\n" +
               "      },\n" +
               "      \"author\": \"BBC News\",\n" +
               "      \"title\": \"Emperor penguin 'needs greater protection'\",\n" +
               "      \"description\": \"The Antarctic icon could lose more than half its population by 2100, say scientists.\",\n" +
               "      \"url\": \"http://www.bbc.co.uk/news/science-environment-49978007\",\n" +
               "      \"urlToImage\": \"https://ichef.bbci.co.uk/images/ic/1024x576/p07qgtww.jpg\",\n" +
               "      \"publishedAt\": \"2019-10-08T23:11:19Z\",\n" +
               "      \"content\": \"Media captionDr Phil Trathan: \\\"Emperors are iconic. I think people can relate to them.\\\"\\r\\nAntarctica's Emperor penguins could be in real difficulty come 2100 if the climate warms as expected.\\r\\nExperts say the birds raise their young on sea-ice and if this plat… [+4144 chars]\"\n" +
               "    },\n" +
               "    {\n" +
               "      \"source\": {\n" +
               "        \"id\": \"bbc-news\",\n" +
               "        \"name\": \"BBC News\"\n" +
               "      },\n" +
               "      \"author\": \"BBC News\",\n" +
               "      \"title\": \"Do Latvians read more Hitler than Harry Potter?\",\n" +
               "      \"description\": \"We investigate claims that Russia is seeking to undermine its neighbour by spreading fake news.\",\n" +
               "      \"url\": \"http://www.bbc.co.uk/news/world-europe-49973668\",\n" +
               "      \"urlToImage\": \"https://ichef.bbci.co.uk/news/1024/branded_news/171DD/production/_109158649_p07qgyfz.jpg\",\n" +
               "      \"publishedAt\": \"2019-10-08T23:03:33Z\",\n" +
               "      \"content\": null\n" +
               "    }" +
               "]}"
    }
}