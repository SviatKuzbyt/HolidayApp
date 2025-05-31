package ua.sviatkuzbyt.holidayapp.ui.elements.list

import android.widget.Button
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.unit.dp
import ua.sviatkuzbyt.holidayapp.R
import ua.sviatkuzbyt.holidayapp.data.Holiday
import ua.sviatkuzbyt.holidayapp.ui.other.basicClick
import ua.sviatkuzbyt.holidayapp.ui.other.indicationClick
import ua.sviatkuzbyt.holidayapp.ui.theme.AppTheme

@Composable
fun HolidayItem(
    item: Holiday,
    isDetail: Boolean,
    onItemClick: () -> Unit
){
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp)
            .padding(bottom = 24.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .basicClick(onItemClick)
        ) {
            ItemIcon()
            ItemMain(item.date, item.name)
        }

        if (isDetail){
            ItemDetail(item.description){}
        }
    }
}

@Composable
private fun ItemIcon(){
    Icon(
        imageVector = ImageVector.vectorResource(R.drawable.ic_calendar),
        tint = AppTheme.colors.primary,
        contentDescription = null,
        modifier = Modifier
            .padding(end = 16.dp)
            .background(
                color = AppTheme.colors.secondary,
                shape = AppTheme.shapes.round
            )
    )
}

@Composable
private fun ItemMain(date: String, name: String){
    Column {
        Text(
            text = date,
            style = AppTheme.types.boldSmall,
            modifier = Modifier.padding(bottom = 4.dp)
        )

        Text(
            text = name,
            style = AppTheme.types.basic
        )
    }
}

@Composable
private fun ItemDetail(text: String, onAddCalendarClick: () -> Unit){
    Column(
        modifier = Modifier
            .padding(top = 8.dp)
            .fillMaxWidth()
            .background(
                color = AppTheme.colors.secondary,
                shape = AppTheme.shapes.container
            )
            .padding(horizontal = 20.dp)
            .padding(top = 16.dp)
    ) {
        Text(
            text = text,
            style = AppTheme.types.basic,
        )

        AddToCalendarButton(onAddCalendarClick)
    }
}

@Composable
private fun AddToCalendarButton(onClick: () -> Unit){
    Row(
        modifier = Modifier
            .padding(vertical = 4.dp)
            .heightIn(48.dp)
            .indicationClick(
                color = AppTheme.colors.primary,
                onClick = onClick
            ),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            imageVector = ImageVector.vectorResource(R.drawable.ic_calendar_add),
            contentDescription = null,
            tint = AppTheme.colors.primary
        )

        Text(
            text = stringResource(R.string.add_to_calendar),
            style = AppTheme.types.blue,
            modifier = Modifier.padding(8.dp)
        )
    }
}