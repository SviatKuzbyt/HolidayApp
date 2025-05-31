package ua.sviatkuzbyt.holidayapp.ui.elements

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import ua.sviatkuzbyt.holidayapp.R
import ua.sviatkuzbyt.holidayapp.data.Month
import ua.sviatkuzbyt.holidayapp.ui.other.indicationClick
import ua.sviatkuzbyt.holidayapp.ui.theme.AppTheme

@Composable
fun BoxScope.MonthPicker(
    month: Month,
    onPreviousClick: () -> Unit,
    onNextClick: () -> Unit
){
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .align(Alignment.BottomCenter)
            .padding(bottom = 16.dp)
            .padding(horizontal = 64.dp)
            .fillMaxWidth()
            .background(
                color = AppTheme.colors.secondary,
                shape = AppTheme.shapes.round
            )
    ) {
        MoveButton(
            isActive = month != Month.January,
            icon = R.drawable.ic_back,
            description = R.string.previous_month,
            onClick = onPreviousClick
        )

        Text(
            text = stringResource(month.name),
            style = AppTheme.types.basic,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .weight(1f)
                .padding(vertical = 8.dp)
        )

        MoveButton(
            isActive = month != Month.December,
            icon = R.drawable.ic_next,
            description = R.string.next_month,
            onClick = onNextClick
        )
    }
}

@Composable
private fun MoveButton(
    isActive: Boolean,
    @DrawableRes icon: Int,
    @StringRes description: Int,
    onClick: () -> Unit
){
    Icon(
        imageVector = ImageVector.vectorResource(icon),
        contentDescription = stringResource(description),
        tint =
            if (isActive) AppTheme.colors.textPrimary
            else AppTheme.colors.textSecondary,
        modifier = Modifier
            .size(48.dp)
            .indicationClick(
                color = AppTheme.colors.primary,
                radius = 24.dp,
                enabled = isActive,
                onClick = onClick
            )
    )
}