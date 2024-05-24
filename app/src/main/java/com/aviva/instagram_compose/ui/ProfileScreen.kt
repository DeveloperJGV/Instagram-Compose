package com.aviva.instagram_compose.ui

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.aviva.instagram_compose.R
import com.aviva.instagram_compose.data.ImageWithText

@Composable
fun ProfileScreen(
){
    var selectedTabIndex by remember {
        mutableIntStateOf(0)
    }
    Column(modifier = Modifier.fillMaxSize()) {
        Spacer(modifier = Modifier.height(10.dp))
        TopBar("iartbydio")
        Spacer(modifier = Modifier.height(10.dp))
        ProfileSection()
        Spacer(modifier = Modifier.height(25.dp))
        ButtonSection(modifier = Modifier.fillMaxWidth())
        Spacer(modifier = Modifier.height(25.dp))
        HighlightSection(
            highlights = listOf(
                ImageWithText(
                    image = painterResource(id = R.drawable.youtube),
                    text = "Youtube"
                ),
                ImageWithText(
                    image = painterResource(id = R.drawable.qa),
                    text = "Q&A"
                ),
                ImageWithText(
                    image = painterResource(id = R.drawable.discord),
                    text = "Discord"
                ),
                ImageWithText(
                    image = painterResource(id = R.drawable.telegram),
                    text = "Telegram"
                ),
                ImageWithText(
                    image = painterResource(id = R.drawable.youtube),
                    text = "Youtube"
                ),
                ImageWithText(
                    image = painterResource(id = R.drawable.qa),
                    text = "Q&A"
                ),
                ImageWithText(
                    image = painterResource(id = R.drawable.discord),
                    text = "Discord"
                ),
                ImageWithText(
                    image = painterResource(id = R.drawable.telegram),
                    text = "Telegram"
                ),
            ),
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 5.dp)
        )
        Spacer(modifier = Modifier.height(10.dp))
        PostTabView(
            imageWithTexts = listOf(
                ImageWithText(
                    image = painterResource(id = R.drawable.grid),
                    text = "Posts"
                ),
                ImageWithText(
                    image = painterResource(id = R.drawable.reels),
                    text = "Reels"
                ),
                ImageWithText(
                    image = painterResource(id = R.drawable.igtv),
                    text = "IGTV"
                ),
                ImageWithText(
                    image = painterResource(id = R.drawable.profile),
                    text = "Profile"
                ),
            )
        ) {
            selectedTabIndex = it
        }
        when(selectedTabIndex){
            0 -> PostSection(
                post = listOf(
                    painterResource(id = R.drawable.profileimg),
                    painterResource(id = R.drawable.profileimg),
                    painterResource(id = R.drawable.profileimg),
                    painterResource(id = R.drawable.profileimg),
                    painterResource(id = R.drawable.profileimg),
                    painterResource(id = R.drawable.profileimg)
                ),
                modifier = Modifier.fillMaxWidth()
            )
        }
    }
}