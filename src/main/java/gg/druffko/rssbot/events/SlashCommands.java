package gg.druffko.rssbot.events;

import static gg.druffko.rssbot.bot.jda;

public class SlashCommands {
    public static void activateSlashCommands(){
        jda.upsertCommand("bot-info", "Information about the bot").setGuildOnly(true).queue();
        jda.upsertCommand("rss-url", "Display Channel being posted").setGuildOnly(true).queue();
    }
}
